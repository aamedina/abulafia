(ns net.wikipunk.abulafia
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.abulafia.boot]
   [net.wikipunk.rdf.abulafia]
   [net.wikipunk.rdf.agentrole]
   [net.wikipunk.rdf.classification]
   [net.wikipunk.rdf.cpannotationschema]
   [net.wikipunk.rdf.hyperreal]
   [net.wikipunk.rdf.informationrealization]
   [net.wikipunk.rdf.objectrole]
   [net.wikipunk.rdf.semiotics]
   [net.wikipunk.rdf.simulation]
   [net.wikipunk.rdf.situation]))

(defrecord Abulafia []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))
