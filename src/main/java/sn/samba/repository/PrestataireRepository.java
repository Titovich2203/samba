package sn.samba.repository;

import sn.samba.domain.Prestataire;
import sn.samba.domain.Prestation;

public interface PrestataireRepository {
    Prestataire[] getAllByPrestation(Prestation prestation);
    Prestataire findById(int idPrestataire);
}
