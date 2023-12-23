class Solution {
    public boolean isPathCrossing(String path) {
        int x =0,y=0;
        Set<String> s = new HashSet<>();
        s.add("0,0");
       
            for(char c:path.toCharArray()){
                switch(c){
                    case 'N': y++;
                    break;
                    case 'S': y--;
                    break;
                    case 'E': x++;
                    break;
                    case 'W': x--;
                    break;
                }
                String crr=x+","+y;
                if(!s.add(crr)){
                    return true;
                }
            }
                return false;   
        }
    }
