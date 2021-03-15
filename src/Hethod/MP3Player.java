package Hethod;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.awt.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*; 
import javazoom.jl.player.Player;
 

public class MP3Player implements Runnable{
    private String filename;
    private Player player;
	public int x;
	Thread t ;
	static BufferedInputStream   buffer;
	public void start() { // 开始进程
		if (t == null)// 如果进程为空值
		{
			t = new Thread(this); // 实例化进程
			t.start(); // 开始进程
		}
	}
	public void run() {
		x = 0;
		while(x == 0)
	        play();
    } 
 
	public void stop()// 停止进程
	{  x = 1;
		try {
			buffer.close();
		} catch (IOException e) {
			//e.printStackTrace();
		}
		t = null;
	}
    public MP3Player(String filename) {//设置文件名
        this.filename = filename;
    }
 
    public void play() {
        try {
            buffer = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(buffer);
            player.play();
        } 
        catch (Exception e) {
        }
 
    }
 
    public static void main(String[] args) {
    	new MP3Player("PDD - 我是全英雄联盟最骚的骚猪.mp3");

    }
 

 
}

