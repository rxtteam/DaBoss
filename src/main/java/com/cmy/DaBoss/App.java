package com.cmy.DaBoss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Boss boss = new Boss();
        boss.setHp(10000);
        boss.setAck(1);;
        boss.setDef(10);
        boss.setName("大脸怪");
        
        Battle battle = new Battle(boss);
        
        Player player1 = new Player(battle);
        player1.setName("李小花");
        player1.setAck(25);
        Player player2 = new Player(battle);
        player2.setName("王小明");
        player2.setAck(50);
        
        Thread thread1 = new Thread(player1);
        Thread thread2 = new Thread(player2);
        
        thread1.start();
        thread2.start();
    }
}
