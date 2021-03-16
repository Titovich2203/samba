package sn.samba.controller;

import sn.samba.repository.DetailPrestationRepository;
import sn.samba.repository.PrestataireRepository;
import sn.samba.repository.PrestationRepository;
import sn.samba.repository.jdbc.DataSource;
import sn.samba.repository.jdbc.JdbcBasedPrestationRepository;
import sn.samba.repository.jdbc.MysqlDataSource;
import sn.samba.repository.ram.ArrayBasedDetailPrestationRepository;
import sn.samba.repository.ram.ListBasedPrestataireRepository;
import sn.samba.service.DisplayService;
import sn.samba.service.MenuService;
import sn.samba.service.console.ConsoleDisplayService;
import sn.samba.service.console.ScannerMenuService;


/**
 * End point destiné aux clients
 * Deux fonctionnalités (services)
 * 1 - Afficher le menu au client : ConsoleDisplayService
 * 2 - Lire les choix du client et afficher le sous-menu correspondant : ScannerMenuService
 */
public class ClientController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public ClientController(){
        DetailPrestationRepository detailPrestationRepository = new ArrayBasedDetailPrestationRepository();
        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService(detailPrestationRepository);
        PrestationRepository prestationRepository = new JdbcBasedPrestationRepository(dataSource);
        PrestataireRepository prestataireRepository = new ListBasedPrestataireRepository();
        scannerMenuService = new ScannerMenuService(displayService, prestationRepository, prestataireRepository );
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }


}
