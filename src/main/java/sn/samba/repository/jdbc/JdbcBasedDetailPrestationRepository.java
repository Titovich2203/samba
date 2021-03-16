package sn.samba.repository.jdbc;

import sn.samba.domain.DetailPrestation;
import sn.samba.repository.DetailPrestationRepository;

public class JdbcBasedDetailPrestationRepository implements DetailPrestationRepository {
    public DetailPrestation[] getAll() {
        return new DetailPrestation[0];
    }
}
