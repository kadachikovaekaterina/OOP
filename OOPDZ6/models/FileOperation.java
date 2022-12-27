package OOPDZ6.models;

import java.util.List;

import OOPDZ3.Node;

public interface FileOperation {
   public List<String> readAllLines();

    public void saveAllLines(List<String> lines);
}
