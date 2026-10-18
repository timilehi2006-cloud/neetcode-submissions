# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev,current = None,head
        while current:
            temp = current.next # temp becomes current next node 
            current.next = prev # current points to nothing then points to what prev is 
            prev = current # prev becomes current 
            current = temp # current becomes temp 
        return prev 
            
        