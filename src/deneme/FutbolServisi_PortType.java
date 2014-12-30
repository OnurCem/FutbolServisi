/**
 * FutbolServisi_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package deneme;

public interface FutbolServisi_PortType extends java.rmi.Remote {
    public KarsilasmaDizisi karsilasmaBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException;
    public boolean takimKaydet(int takimNo, java.lang.String takimAdi, deneme.FutbolcuTipi[] futbolcular) throws java.rmi.RemoteException;
    public boolean karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException;
    public boolean golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException;
    public deneme.TakimTipi takimBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException;
}
