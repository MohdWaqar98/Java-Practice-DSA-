import java.util.*;
public class Displacement {
    public static void displacement(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        float disp=(float)Math.sqrt((x*x)+(y*y));
        System.out.println(disp);
    }
    public static void main(String args[]){
        String path="NNSS";
        displacement(path);
    }
}
