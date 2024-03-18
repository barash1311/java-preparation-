package com.barash.day13;

import java.util.Arrays;

public class pathtracer {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] ans=new int[maze.length][maze[0].length];
        path("",maze,0,0,ans,1);

    }
    public static void path(String p,boolean[][] maze,int r,int c,int[][] ans,int step){

        if(r==maze.length-1 && c==maze[0].length-1){
            ans[r][c]=step;
            for(int[] arr:ans){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        ans[r][c]=step;
        if(r<maze.length-1){
            path(p+"D",maze,r+1,c,ans,step+1);
        }
        if(c<maze[0].length-1){
            path(p+"R",maze,r,c+1,ans,step+1);
        }
        if(r>0){
            path(p+"U",maze,r-1,c,ans,step+1);
        }
        if(c>0){
            path(p+"L",maze,r,c-1,ans,step+1);
        }
        maze[r][c]=true;
        ans[r][c]=0;

    }
}
