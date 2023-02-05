import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static class Page{
        String url;
        Integer viewCount;

        public Page(String url, Integer viewCount) {
            this.url = url;
            this.viewCount = viewCount;
        }

        @Override
        public String toString() {
            return "Page{" +
                    "url='" + url + '\'' +
                    ", viewCount=" + viewCount +
                    '}';
        }
    }
    public static void main(String[] args) {
        Stack<Page> stack = new Stack<>();
        stack.push(new Page("Link1",9));
        stack.push(new Page("Link2",56));
        stack.push(new Page("Link3",23));
        stack.push(new Page("Link4",6));
        stack.push(new Page("Link5",3));
        stack.push(new Page("Link6",1));
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}