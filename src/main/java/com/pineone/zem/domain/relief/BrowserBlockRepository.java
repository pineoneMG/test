package com.pineone.zem.domain.relief;

import com.pineone.zem.domain.relief.aggregate.BrowserBlockPackage;

import java.util.List;

public interface BrowserBlockRepository {
  List<BrowserBlockPackage> findAll();
}
