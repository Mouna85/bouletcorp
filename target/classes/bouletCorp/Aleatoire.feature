@aleatoire
Feature: Tester la rubrique Aleatoire
  ETQ utilisateur je souhaite tester la rubrique Aleatoire
  @aleatoire_ok
  Scenario: Tester la rubrique Aleatoire
    Given Je me connecte à l'application bouletcorp
    When Je clique sur le bouton Aleatoire
    Then Je vérifie la page a changé
    And Je vérifie les widgets facebook, twitter et tumblr sont bien affichés

  