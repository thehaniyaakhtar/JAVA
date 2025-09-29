public class Main{
    public static void main(String[] args) {
        String name = "Harry";
        String channel = "yt channel";
        System.out.println(name);
        System.out.println(name + "from" + channel);
        System.out.print(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        
        System.out.println(name + " from\" "+ channel);
        System.out.println(name + " from\\ " + channel);
        System.out.println(name + " from\t " + channel);
        System.out.println(name + " from\n " + channel);
        
        System.out.println(name.contains("arr"));
        System.out.println(name.charAt(2));
        System.out.println(name.endsWith("ry"));


        
    }
}
