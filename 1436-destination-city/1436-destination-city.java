class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> path = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            path.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        
        String nextCity = paths.get(0).get(1);
        String currCity = "";
        while (!nextCity.equals("")) {
            currCity = nextCity;
            nextCity = path.getOrDefault(nextCity, "");
        }
        return currCity;
    }
}