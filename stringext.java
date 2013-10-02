class stringext
    {
    public static void stringpyramid(String s) {
    int i=0;
    String stored = "";
    while(i+3 < s.length()) {
        stored += s.substring(i, i+3);
        System.out.println(stored);
        i+=3;
    }
    System.out.println(s);
}
}