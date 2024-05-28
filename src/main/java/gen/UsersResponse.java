package gen;

import java.util.List;

class UsersResponse {
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<Object> data;

    public UsersResponse(int draw, int recordsTotal, int recordsFiltered, List<Object> data) {
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
        this.data = data;
    }

    // Getters and setters
}
