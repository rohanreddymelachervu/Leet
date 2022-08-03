class MyCalendar {
    List<List<Integer>> books;
    public MyCalendar() {
        books=new ArrayList<>();        
    }
    
    public boolean book(int start, int end) {
        for(List<Integer> b : books){
            if(Math.max(b.get(0),start)<Math.min(b.get(1),end)) return false;
        }
        books.add(new ArrayList<>(Arrays.asList(start,end)));
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */