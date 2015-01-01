/**
 * FutbolServisi_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public interface FutbolServisi_PortType extends java.rmi.Remote {
    public FutbolServisi_pkg.KarsilasmaYaniti karsilasmaGetir(int takimNo) throws java.rmi.RemoteException;
    public FutbolServisi_pkg.ServisYaniti takimKaydet(int takimNo, java.lang.String takimAdi, FutbolServisi_pkg.Futbolcu[] futbolcular) throws java.rmi.RemoteException;
    public FutbolServisi_pkg.ServisYaniti karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException;
    public FutbolServisi_pkg.ServisYaniti golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException;
    public FutbolServisi_pkg.TakimYaniti takimGetir(int takimNo) throws java.rmi.RemoteException;
}
