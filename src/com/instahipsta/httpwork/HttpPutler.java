package com.instahipsta.httpwork;

import android.os.AsyncTask;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Vladislove on 06.11.2014.
 */
public class HttpPutler extends AsyncTask<Void,Void,Void>{

    String user;
    String password;

    @Override
    protected Void doInBackground(Void... params) {
        try {
            URL url = new URL("https://mcd.cloudant.com/course/vlad");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("Authorization", "Basic eW91Z2h0dGVzdHJ1Y2hlbnRlbmdzdHJpOkRLMU9rSzNoaTBNOFVwMjFzMmlVaTVDQQ==");
            connection.setRequestMethod("PUT");
            connection.setDoInput(true);
            connection.connect();
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(("{\"name\":\"" +user+ "\", \"password\":\"\"" +password+ "\"}").getBytes());
            outputStream.flush();
            int code = connection.getResponseCode();
            InputStream is = connection.getInputStream();
            String contentAsString = readIt(is, 500);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readIt(InputStream stream, int len) throws IOException, UnsupportedEncodingException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }
}
