/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator_design_pattern;

import java.util.Iterator;

/**
 *
 * @author Yousef
 */
public class Matrix<T> implements Iterator<T> {

    private int row;
    private int col;
    private T[][] matrix;
    int index;

    @SuppressWarnings("unchecked")
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = (T[][]) new Object[row][col];
    }

    public Iterator<T> getIterator() {
        index = -1;
        return (Iterator<T>) this;
    }

    public void setItem(T t, int i, int j) {
        matrix[i][j] = t;
    }

    public T getItem(int i, int j) {
        return matrix[i][j];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return col;
    }

    @Override
    public boolean hasNext() {
        return index < col * row - 1;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            index++;
            return this.getItem(index / col, index % col);
        }
        return null;
    }
}
