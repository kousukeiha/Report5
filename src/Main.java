public class Main{
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println("文字長さは"+str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointExceptionが発生しました。");
            System.out.println("Exception Message;" + e.getMessage());
        }
    }
}
