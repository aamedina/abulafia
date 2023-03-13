(ns net.wikipunk.rdf.abulafia
  "A Theory of Semiotics."
  {:rdf/type        :owl/Ontology
   :dcterms/creator "Umberto Eco"}
  (:require
   [net.wikipunk.rdf.semiotics]
   [net.wikipunk.rdf.hyperreal]
   [net.wikipunk.rdf.simulation]))

(def Imaginary
  "The :simulation/Context for Abulafia's imagination."
  {:db/ident               :abulafia/Imaginary
   :rdf/type               [:owl/Class :simulation/Context]
   :simulation/isContextOf :abualfia/Imagination})

(def Imagination
  "The space where imaginary rays can be cast."
  {:db/ident                         :abulafia/Imagination
   :rdf/type                         [:owl/Class :simulation/Simulation]
   :simulation/hasContext            :abulafia/Imaginary
   :simulation/hasRealityCounterpart :hyperreal/imagination
   :simulation/hasSimulacrum         :abulafia/ImaginaryRay})

(def ImaginaryRay
  "The class of imaginary rays."
  {:db/ident                  :abulafia/ImaginaryRay
   :rdf/type                  [:owl/Class :simulation/Simulacrum]
   :simulation/isSimulacrumOf :abulafia/Imagination})
