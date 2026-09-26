class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++)
        {
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 ;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                i++;
                s2=new StringBuilder();
                while(s.charAt(i)!=')')
                {
                    s2.append(s.charAt(i));
                    i++;
                }
                //System.out.println(s2+" "+map);
                String s3=map.getOrDefault(s2.toString(),"?");
                s1.append(s3);
            }
            else
            {
                s1.append(c);
            }
        }
        return s1.toString();
    }
}