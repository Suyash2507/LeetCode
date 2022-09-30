// https://leetcode.com/problems/design-parking-system

class ParkingSystem {
    int big;
    int med;
    int sm;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.med=medium;
        this.sm=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(big>=1){
                big--;
                return true;
            }
            else{
                return false;
            }
        }
        if(carType==2){
            if(med>=1){
                med--;
                return true;
            }
            else{
                return false;
            }
        }
        if(carType==3){
            if(sm>=1){
                sm--;
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */