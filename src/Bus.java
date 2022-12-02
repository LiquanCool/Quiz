public class Bus {
    private int stops;
    private int currentStop;
    private boolean direction;

    public Bus (int stops)
    {
        this.stops = stops;
        currentStop = 1;
        direction = true;
    }

    public int getCurrentStop()
    {
        return currentStop;
    }

    public void move()
    {
        if(currentStop == stops)
        {
            direction = false;
        }
        if (currentStop == 1)
        {
            direction = true;
        }
        if (direction)
        {
            currentStop++;
        }
        else
        {
            currentStop--;
        }
    }
}
