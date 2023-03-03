package Graphs;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex= sc.nextInt();
        int edges=sc.nextInt();
        int[][] matrix= new int[vertex][vertex];
        for(int i=0;i<edges;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            matrix[a][b]=1;
            matrix[b][a]=1;
        }
//        Printing the input matrix----->
//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j< matrix.length;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        bfsTraversal(matrix);
    }

    public static void dfsTraversal(int[][] matrix){
        boolean[] visited = new boolean[matrix.length];
        for(int i=0;i< visited.length;i++){
            if(visited[i]==false){
                dfsTraversal(matrix,i,visited);
                System.out.println();
            }

        }
    }
    private static void dfsTraversal(int[][] matrix, int startRow,boolean[] visited){
        System.out.print(startRow+" ");
        visited[startRow]=true;
        for(int i=0;i<matrix.length;i++){
            if(matrix[startRow][i]==1 && visited[i]==false){
                dfsTraversal(matrix,i,visited);
            }
            if(i== matrix.length-1 && matrix[startRow][i]!=1){
                return;
            }
        }
    }

    public static void bfsTraversal(int[][] matrix){
        if(matrix.length==0){
            return;
        }
        boolean visited[] = new boolean[matrix.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                Queue<Integer> q= new LinkedList<>();
                q.add(i);
                visited[i]=true;
                bfsTraversal(matrix,visited,q);
                System.out.println();
            }
        }
    }

    private static void bfsTraversal(int[][] matrix, boolean[] visited, Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int temp= q.peek();
        System.out.print(temp+" ");
        visited[temp]=true;
        for(int i=0;i< matrix.length;i++){
            if(matrix[temp][i]==1 && visited[i]==false){
                q.add(i);
                visited[i]=true;
            }
        }
        q.poll();

        bfsTraversal(matrix,visited,q);
    }
    //    private static void bfsTraversal(int[][] matrix,boolean[] visited, Queue<Integer> q, int currVertex){
//        System.out.print(currVertex+" ");
//
//        if(currVertex!=0 && q.isEmpty()){
//            return;
//        }
//
//        for(int i=0;i<matrix.length;i++){
//            if(matrix[currVertex][i]==1 && visited[i]==false){
//                q.add(i);
//                visited[i]=true;
//            }
//        }
//        if(q.isEmpty()==false){
//            int temp= q.peek();
//            q.poll();
//            bfsTraversal(matrix,visited, q, temp);
//        }
//    }



}
