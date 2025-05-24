package com.neoteric.hotelServiceCompletableFutureUsingStreams;

public class Images2 {
    private int id;
    private String url;
    private int locationId;
    private String name;

    public Images2(int id, String url, int locationId, String name) {
        this.id = id;
        this.url = url;
        this.locationId = locationId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", locationId=" + locationId +
                ", name='" + name + '\'' +
                '}';
    }
}
