package com.barash.day13;

public class back {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
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
        maze[r][c]=false;
        if(r<maze.length-1){
            finder(p+"D",maze,r+1,c);
        }
        if(c<maze.length-1){
            finder(p+"R",maze,r,c+1);
        }
        if(r>0){
            finder(p+"U",maze,r-1,c);
        }
        if(c>0){
            finder(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }
}
