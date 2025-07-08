class Solution:
    def arrangeCoins(self, total):
        left,rig= 0, total
        while left<=rig:
            mid=(left+rig) // 2
            coins_need= mid*(mid+1)//2
            if coins_need<=total:
                left=mid+1
            else:
                rig=mid-1
        return rig
