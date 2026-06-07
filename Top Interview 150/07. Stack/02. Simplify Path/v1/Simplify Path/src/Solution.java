import java.util.Stack;

class Solution {

    public String simplifyPath(String path) {

        //creates and initializes variables
        Stack<String> stack = new Stack<>();
        String[] pathArr = path.split("/"); //splits the directories based on the "/" delimiter
        StringBuilder canonPath = new StringBuilder(); //prevents string objects from being created multiple times (immutable object) when appending strings

        //iterates through each directory and evaluates how to build path
        for(String dir : pathArr) {

            //if current or empty, no action required
            if(dir.equals(".") || dir.equals("")) {
                continue;

                //if parent, move to parent directory by popping current directory
            } else if (dir.equals("..")) {

                if(!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(dir);
            }
        }

        //builds canonical path
        for(Object s : stack.toArray()) {
            canonPath.append("/").append((String) s);
        }

        return (canonPath.isEmpty()) ? "/" : canonPath.toString();
    }
}