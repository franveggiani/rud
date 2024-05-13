package com.divisiongis.rud.Service;

import java.util.List;

import com.divisiongis.rud.Entity.catastro.CapasCartografia;

public interface CapasCartografiaService extends BaseService<CapasCartografia, Long> {
    public List<CapasCartografia> getCapasCartografia() throws Exception;
}
