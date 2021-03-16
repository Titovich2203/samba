package sn.samba.repository.jdbc;

import sn.samba.domain.Prestataire;
import sn.samba.domain.Prestation;
import sn.samba.repository.PrestataireRepository;

public class JdbcBasedPrestataireRepository implements PrestataireRepository {
    public Prestataire[] getAllByPrestation(Prestation prestation) {
        return new Prestataire[0];
    }

    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
