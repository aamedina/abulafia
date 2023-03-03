(ns net.wikipunk.rdf.abulafia
  {:rdf/type :owl/Ontology})

(def Imagination
  "The space where imaginary rays can be cast."
  {:db/ident :abulafia/Imagination
   :rdf/type [:owl/Class :simulation/Simulation]
   :simulation/hasContext :hyperreal/generalOrUnknown
   :simulation/hasRealityCounterpart :hyperreal/imagination
   :simulation/hasSimulacrum :abulafia/ImaginaryRay})

(def ImaginaryRay
  "The class of imaginary rays."
  {:db/ident :abulafia/ImaginaryRay
   :rdf/type [:owl/Class :simulation/Simulacrum]
   :simulation/isSimulacrumOf :abulafia/Imagination})
