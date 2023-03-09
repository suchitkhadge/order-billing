import java.util.List;

public class Item {
    private float height;
    private float width;
    private float depth;
    private float price;

    public Item(float height, float width, float depth, float price) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.price = price;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }

    public float getPrice() {
        return price;
    }

    public float getServiceFee() {
        float serviceFee = price * 0.03f;
        if (serviceFee < 1.5f) {
            serviceFee = 1.5f;
        }
        return serviceFee;
    }

    public float getFulfillmentFee() {
        float dimensionSum = height + width + depth;
        float fulfillmentFee = 0.0f;
        if (dimensionSum <= 10.0f) {
            fulfillmentFee = 1.2f;
        } else if (dimensionSum <= 20.0f) {
            fulfillmentFee = 2.5f;
        } else if(dimensionSum <= 30.0f){
            fulfillmentFee = 3.73f;
        }
        else if(dimensionSum <= 40.0f){
            fulfillmentFee = 4.92f;
        }
        else if(dimensionSum >= 20.0f){
            fulfillmentFee = 7.12f;
        }
        return fulfillmentFee;
    }
}






