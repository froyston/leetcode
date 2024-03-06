class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> hasOutGoing = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            hasOutGoing.add(paths.get(i).get(0));
        }
        for (int j = 0; j < paths.size(); j++) {
            if (!hasOutGoing.contains(paths.get(j).get(1))) {
                return paths.get(j).get(1);
            }
        }
        return "";
    }
}