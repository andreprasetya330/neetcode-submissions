class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        int points = 0;
        for(String o: operations){
            if(o.equals("+")){
                int a = score.pop();
                int b = score.pop();
                score.push(b);
                score.push(a);
                score.push(a+b);
            }else if(o.equals("D")){
                int d = score.pop();
                int doubled = d*2;
                score.push(d);
                score.push(doubled); 
            }else if(o.equals("C")){
                score.pop();
            }else{
                score.push(Integer.parseInt(o));
            }
        }
        while(!score.isEmpty()){
            points+= score.pop();
        }
        return points;
    }
    
}