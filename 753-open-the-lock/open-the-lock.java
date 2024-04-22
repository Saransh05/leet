class Solution {
    public int openLock(String[] deadends, String target) {
        if(target.equals("0000"))return 0;
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        // Marking the deadends as visited so we don't visit them again.
        //If the start itself is a deadend , no moves possible
        if(visited.contains("0000"))return -1;
        Queue<Pair<String,Integer>> combsToVisit = new LinkedList<>();
        combsToVisit.offer(new Pair<>("0000",0));
        while(!combsToVisit.isEmpty()) {
            Pair<String,Integer> current = combsToVisit.poll();
            String currentCombination = current.getKey();
            //visited.add(currentCombination);
            int moves = current.getValue();
            if(currentCombination.equals(target))return moves;

            // Add all possible moves from current move to the queue, since it is a BFS
            for(int i=0;i<4;i++) {
                //Since the dial can move up or down
                for(int dialMove:new int[]{1,-1}) {
                    //Modulo 10 as numbers are from 0-9 only.
                    int newDigit = (currentCombination.charAt(i)-'0' + dialMove + 10)%10;
                    String newCombination = currentCombination.substring(0,i)+newDigit + currentCombination.substring(i+1);
                    if(!visited.contains(newCombination)) {
                        visited.add(newCombination);
                        combsToVisit.offer(new Pair<>(newCombination,moves+1));
                    }
                }
            }
        }
        return -1;
    }
}