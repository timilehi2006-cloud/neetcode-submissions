# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        #make a dummy node 
        #compare the node value of node in list1 to the value of node in list2 
        # if val of node in list1 < val node in list2 
        #pointer of dummy node will point to node of list1 
        # new head of list1 will be list1.next 
        # dummy current node will be node.next 
        # else dummy node will point to node of list2 
        # new head of list2 will be list2.next 
        # dummy current node will be node.next 
        # edge case remaining node will point to remaining node of list 1 or list 2 id remains exiist in list1 or list2
        dummy = node = ListNode()
        while list1 and list2 is not None :
            if list1.val < list2.val :
                node.next = list1
                list1 = list1.next 
                node = node.next 
            else:
                node.next = list2 
                list2 = list2.next
                node = node.next 

        node.next = list1 or list2 
        return dummy.next 


        