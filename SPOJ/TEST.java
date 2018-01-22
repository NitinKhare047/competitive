import java.io.*;
class TEST{
    public static void main(String[] args)throws IOException{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x;
            while (true){
                  x= Integer.parseInt(br.readLine());
                  if(x == 42) break;
                  else
                  System.out.println(x);
            }
        }catch(Exception e){
            return;
        }
    }
}