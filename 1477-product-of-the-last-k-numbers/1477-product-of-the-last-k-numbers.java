class ProductOfNumbers {
    private List<Integer> nums;
    private int n;
    
    public ProductOfNumbers() {
        nums = new ArrayList<>();
        n = 0;
    }
    
    public void add(int num) {
        nums.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1;
        int n = nums.size();
        
        for(int i = n - k; i < n; i++) {
            prod *= nums.get(i);
        }
        
        return prod;
    }
}
