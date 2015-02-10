(ns re-demo.layouts
  (:require [re-com.box     :refer [h-box v-box box gap line scroller border]]
            [re-com.layout  :refer [h-layout v-layout]]
            [re-com.core    :refer [title]]
            [re-com.buttons :refer [button]]))


(def rounded-panel {:background-color "#fff4f4"
                    :border           "1px solid lightgray"
                    :border-radius    "8px"
                    ;:margin           "8px"
                    :padding          "8px"
                    :flex             "1"
                    ;:overflow-x       "hidden"
                    ;:overflow-y       "auto"
                    })

(defn left-panel
  []
  [box
   :size "auto"
   :child [:div {:style rounded-panel}
           [:h4 "Left panel"]]])


(defn right-panel
  []
  [box
   :size "auto"
   :child [:div {:style rounded-panel}
           [:h4 "Right panel"]]])


(defn top-panel
  []
  [box
   :size "auto"
   :child [:div {:style rounded-panel}
           [:h4 "Top panel"]]])


(defn bottom-panel
  []
  [box
   :size "auto"
   :child [:div {:style rounded-panel}
           [:h4 "Bottom panel"]]])


(defn panel2
  []
  [h-box
   :size "auto"
   :children [[v-box
               :size     "auto"
               :children [[title :label "Horizontal Layout"]
                          [h-layout
                           :left-panel    left-panel
                           :right-panel   right-panel]]]
              [gap :size "10px"]
              [line]
              [gap :size "10px"]
              [v-box
               :size     "auto"
               :children [[title :label "Vertical Layout"]
                          [v-layout
                           :top-panel     top-panel
                           :bottom-panel  bottom-panel
                           :initial-split "25%"]]]]])


(defn panel   ;; Only required for Reagent to update panel2 when figwheel pushes changes to the browser
  []
  [panel2])
