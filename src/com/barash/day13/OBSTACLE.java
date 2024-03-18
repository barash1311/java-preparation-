package com.barash.day13;

public class OBSTACLE {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        finder("",maze,0,0);


    }
    public static void finder(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            finder(p+"D",maze,r+1,c);
        }
        if(c<maze.length-1){
            finder(p+"R",maze,r,c+1);
        }
    }
}
