import model.SpecialEntity;

import java.util.HashMap;

public class Board {
    int dimension;

    HashMap<Integer, SpecialEntity> specialEntityHaspMap;

    public Board(int dimension) {
        this.dimension = dimension;
    }

    int getTotalCells() {
        return this.dimension * this.dimension;
    }

    public void printBoard() {
        int totalCells = dimension * dimension;
        for(int i = totalCells; i > 0; i--) {
            System.out.println(" | " + i + " ");
            if(hasSpecialEntity(i)) {
                System.out.println(specialEntityHaspMap.get(i).getId());
            }
            System.out.print(" |");
            if(totalCells % dimension == 0) {
                System.out.println();
            }
        }
    }

    public boolean hasSpecialEntity(int position) {
        return specialEntityHaspMap.containsKey(position);
    }

    public void addSpecialEntity(SpecialEntity entity) {
        int getStartPosition = entity.getStart();
        specialEntityHaspMap.put(getStartPosition, entity);
    }

    public SpecialEntity getSpecialEntity(int position) {
        if(hasSpecialEntity(position)) {
            return specialEntityHaspMap.get(position);
        }
        return null;
    }
}
