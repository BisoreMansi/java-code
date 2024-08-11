//StringBuffer = ThreadSafe
//String Builder = not ThreadSafe
class code3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("MAnsi");
        // System.out.println(sb.capacity());//16
        System.out.println(sb.length());
        sb.append("  Bisore");
        System.out.println(sb);
        sb.deleteCharAt(3);
        sb.insert(0,"hello");
        sb.setLength(60);
        System.out.println(sb);

        // String str = sb;//String buffer is not convert into string
        String str = sb.toString();

    }

}
