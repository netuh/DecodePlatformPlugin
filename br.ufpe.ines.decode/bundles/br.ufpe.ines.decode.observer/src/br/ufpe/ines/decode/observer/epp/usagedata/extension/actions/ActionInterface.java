package br.ufpe.ines.decode.observer.epp.usagedata.extension.actions;

public interface ActionInterface {
  public String getKind();
  public String getDescription();
  public Boolean allowAddingData();
}