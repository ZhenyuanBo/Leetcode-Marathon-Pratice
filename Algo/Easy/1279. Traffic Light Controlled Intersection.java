class TrafficLight {
    Road A;
    Road B;
    
    public TrafficLight() {
        A = new Road();
        A.id = 1;
        A.direction = 1;
        A.oppDirection = 2;
        A.isGreen=true;
        
        B = new Road();
        B.id = 2;
        B.direction = 3;
        B.oppDirection = 4;
        B.isGreen = false;
    }
    
    public void carArrived(
        int carId,           // ID of the car
        int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
        int direction,       // Direction of the car
        Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
        Runnable crossCar    // Use crossCar.run() to make car cross the intersection 
    ) {
        synchronized(this){
            if(roadId == A.id && A.isGreen && (direction==A.direction || direction==A.oppDirection)){
                crossCar.run();
            }else if(roadId == B.id && A.isGreen){
                turnGreen.run();
                crossCar.run();
                A.isGreen=false;
                B.isGreen = true;
            }

            if(roadId == B.id && B.isGreen && (direction==B.direction || direction==B.oppDirection)){
                crossCar.run();
            }else if(roadId == A.id && B.isGreen){
                turnGreen.run();
                crossCar.run();
                B.isGreen = false;
                A.isGreen = true;
            }
        }
    }

}

class Road{
    public int id;
    public int direction;
    public int oppDirection;
    public boolean isGreen;
}