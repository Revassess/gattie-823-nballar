SELECT app_user.username, study_set."name", f.category_id, f.question, f.answer 
FROM app_user 
INNER JOIN study_set 
	ON study_set.owner_id = app_user.user_id 
INNER JOIN study_set_card 
	ON study_set.study_set_id = study_set_card.study_set_id 
INNER JOIN flashcard f 
	ON study_set_card.flashcard_id = f.flashcard_id 
WHERE app_user.user_id = 4;