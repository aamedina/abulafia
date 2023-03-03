(ns net.wikipunk.abulafia.boot
  {:rdf/type :jsonld/Context}
  (:require
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.dcterms]
   [net.wikipunk.rdf.prov]
   [net.wikipunk.rdf.xhv]
   [net.wikipunk.rdf.xsd]
   [net.wikipunk.rdf.vann]))

(def abulafia
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/abulafia/"
   :rdfa/prefix "abulafia"})

(def simulation
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://www.w3id.org/simulation/ontology/"
   :rdfa/prefix "simulation"
   :rdf/ns-prefix-map {"cpannotationschema"
                       "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
                       "dcterms"    "http://purl.org/dc/terms/",
                       "owl"        "http://www.w3.org/2002/07/owl#",
                       "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"     "http://schema.org/",
                       "simulation" "https://www.w3id.org/simulation/ontology/",
                       "vann"       "http://purl.org/vocab/vann/",
                       "xhv"        "https://www.w3.org/1999/xhtml/vocab#",
                       "prov"       "https://www.w3.org/ns/prov-o-inverses#"
                       "xsd"        "http://www.w3.org/2001/XMLSchema#"}})

(def hyperreal
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://www.w3id.org/simulation/data/"
   :rdfa/prefix "hyperreal"
   :rdf/ns-prefix-map
   {"dcterms"    "http://purl.org/dc/terms/",
    "hyperreal"  "https://w3id.org/simulation/data/",
    "owl"        "http://www.w3.org/2002/07/owl#",
    "prov"       "http://www.w3.org/ns/prov#",
    "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
    "schema"     "http://schema.org/",
    "simulation" "https://w3id.org/simulation/ontology/"}})

(def semiotics
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#"
   :rdfa/prefix "semiotics"})

(def agentrole
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl#"
   :rdfa/prefix "agentrole"})

(def objectrole
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl#"
   :rdfa/prefix "objectrole"})

(def dul
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl#"
   :rdfa/prefix "dul"})

(def cpannotationschema
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#"
   :rdfa/prefix "cpannotationschema"})

(def situation
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/situation.owl#"
   :rdfa/prefix "situation"})

(def classification
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/classification.owl#"
   :rdfa/prefix "classification"})

(def informationrealization
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl#"
   :rdfa/prefix "informationrealization"})

(def ili
  {:dcat/downloadURL "https://raw.githubusercontent.com/globalwordnet/cili/master/ili.ttl"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://globalwordnet.org/ili/"
   :rdfa/prefix      "ili"})

(def snap
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://github.com/snap-stanford/snap/"
   :rdfa/prefix "snap"})
