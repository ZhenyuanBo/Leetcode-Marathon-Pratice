# Write your MySQL query statement below

SELECT
round(ifnull((
    (SELECT COUNT(*) FROM (SELECT DISTINCT requester_id, accepter_id FROM request_accepted) as A)
    /
    (SELECT COUNT(*) FROM (SELECT DISTINCT sender_id, send_to_id FROM friend_request) as R)
    ),0),2) as accept_rate;
