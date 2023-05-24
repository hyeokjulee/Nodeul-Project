package com.bookitaka.NodeulProject.sheet;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface SheetRepository {

    public Sheet createSheet(Sheet sheet);
    
    public List<Sheet> findAllSheet(SheetCri cri);

    public List<Sheet> findAllSheetByGenre(String genre, SheetCri cri);

    public List<Sheet> findAllSheetByAgeGroup(String ageGroup, SheetCri cri);

    public Optional<Sheet> findSheetByNo(int sheetNo);

    public boolean updateSheet(int sheetNo ,SheetUpdateDto sheetUpdateDto);

    public boolean deleteSheet(int sheetNo);

    public Long countSheet();

}
