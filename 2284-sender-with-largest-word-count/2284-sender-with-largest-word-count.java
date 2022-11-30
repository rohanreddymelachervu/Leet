class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = messages.length;
        for(int i=0; i<n; i++){
            if(!map.containsKey(senders[i])){
                map.put(senders[i], messages[i].split(" ").length);
            }else{
                map.put(senders[i], map.get(senders[i]) + messages[i].split(" ").length);
            }
        }
        int max = 0, count = 0;
        for(String key : map.keySet()){
            max = Math.max(max, map.get(key));
        }
        
        String maxSender = "";
        for(String key : map.keySet()){
            if(map.get(key) == max) count++;
        }
        for(String key : map.keySet()){
            if(map.get(key) == max){
                if(count == 1) return key;
                else{
                    maxSender = key.compareTo(maxSender) > 0 ? key : maxSender;
                }
            }
        }
        return maxSender;
    }
}